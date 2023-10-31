let baseUrl = "http://localhost:8080/Back_End_war/";

$("#btnUpload").click(function () {
    let form = new FormData($("#form")[0]);
    $.ajax({
        url: baseUrl + "upload",
        method: "post",
        data: form,
        contentType: false,
        processData: false,
        success: function (res) {
            alert(res.message)

            $.ajax({
                url: baseUrl + "upload",
                method: "GET",
                contentType: "application/json",
                dataType: "json",
                success: function (res) {
                    for (let i of res.data) {
                        $("#imgPreview").append(`<img src="${baseUrl + i.upload}"  style="border: 1px solid black; height: 300px;width: 400px;" alt="">`);
                    }

                },
                error: function (error) {
                    alert(error.responseJSON.message);
                }
            });

        },
        error: function (error) {
            alert(error.responseJSON.message);
        }
    });
});