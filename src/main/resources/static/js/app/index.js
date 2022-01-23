let main = {
    init: () => {
        $('#btn-save').on('click', () => {
            main.save();
        });

        $('#btn-update').on('click', () => {
            main.update();
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
        });
    },
    update: () => {
        let data = {
            title: $('#title').val(),
           content: $('#content').val(),
        };

        let id = $('#id').val();

        $.ajax({
            type: 'PUT',
            url: '/api/v1/posts/' + id,
            dataType: 'json',
            contentType: 'application/json; charset="utf-8"',
            data: JSON.stringify(data)
        }).done(() => {
            alert('글이 수정되었습니다.');
            window.location.href='/';
        }).fail((err) => {
            alert(JSON.stringify(err));
        });
    }
}

main.init();