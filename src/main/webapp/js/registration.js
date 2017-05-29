/**
 * Created by user on 28.05.2017.
 */



function placeholderIsSupported() {
    test = document.createElement('input');
    return ('placeholder' in test);
}

$(document).ready(function(){
    placeholderSupport = placeholderIsSupported() ? 'placeholder' : 'no-placeholder';
    $('html').addClass(placeholderSupport);
});