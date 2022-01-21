let main = {
    init: () => {
        $('#btn-save').on('click', () => {
            main.save();
        });
    },
    save: () => {
        let data = {
            title: $('#title').val(),
            author: $('#author').val(),
            content: $('#content').val(),
        };

        $.ajax({
            type: 'POST',
            url: '/api/v1/posts',
            dataType: 'json',
            contentType: 'application/json; charset="utf-8"',
            data: JSON.stringify(data)
        }).done(() => {
            alert('글이 등록되었습니다.');
            window.location.href='/';
        }).fail((err) => {
            alert(JSON.stringify(err));
        })
    }
}

main.init();