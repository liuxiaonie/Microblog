$(document).ready(		
	function() {
		
		cancel = $("#cancel");
		filter = $("#filter");
		box = $("#dialog-box");
		submit = $("#sub-mb");
		op = $(".set-list-op");
		msg = $(".set-list-msg");
		
		isVisible = false;
		$(".set-list").mouseover(
			function() {
			
				$(this).siblings(".top-menulist-wrap").slideDown('slow');	
												
			}
		);


		$(".top-set-list").mouseleave(
				function() {
						//alert($(this).children(".top-menulist-wrap").attr("class"));
						$(this).children(".top-menulist-wrap").slideUp('fast');
				});

		
		submit.click(
			function () {				
				filter.css({"width":$(window).width(),"height":$(window).height()});
				box.css("display","block");
				center(box);
			}
		);
				
		cancel.click(
			function() {
				filter.css({"height":"0px","width":"0px"});
				box.css("display","none");
			});
	}
);


function center(el) {  //垂直居中
	
	var eltop = ($(window).height() - el.height()) / 2 + "px";
	var elleft = ($(window).width() - el.width()) / 2 +"px";
	el.css({"top":eltop,"left":elleft});
}
function slideDown(el) {
	el.siblings(".top-menulist-wrap").delay(1000).slideDown("fast");
}
function slideUp(el) {
	el.siblings(".top-menulist-wrap").delay(1000).slideUp("fast");
}

