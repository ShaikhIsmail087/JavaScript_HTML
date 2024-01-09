$('form').on('submit', function(e) {
    let allFilled = true;
    $(this).find('input[type="email"],input[type="password"]').each(function(indx, item) {
      let filled = item.value.length;
      if (!filled) {
        $(item).addClass('my-shake');
        setTimeout(function() {
          $(item).removeClass('my-shake');
        }, 500);
        allFilled = !!filled;
      }
    });
    return allFilled;
  });