document.querySelector('form').addEventListener('submit', function(e) {
  let allFilled = true;
  const inputFields = this.querySelectorAll('input[type="email"], input[type="password"]');

  inputFields.forEach(function(item) {
    let filled = item.value.trim().length;
    if (!filled) {
      item.classList.add('my-shake');
      setTimeout(function() {
        item.classList.remove('my-shake');
      }, 500);
      allFilled = !!filled;
    }
  });

  if (!allFilled) {
    e.preventDefault(); // Prevent form submission if any field is empty
  }
});
