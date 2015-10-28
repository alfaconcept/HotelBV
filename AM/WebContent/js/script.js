function mostra() {  
	if(document.getElementById('selPag').value == 1) {
    document.getElementById('relativo').style.display = 'block';
    document.getElementById('relativo1').style.display = 'none';
    document.getElementById('relativo2').style.display = 'none';
}	
	if(document.getElementById('selPag').value == 2) {
    document.getElementById('relativo').style.display = 'none';
    document.getElementById('relativo1').style.display = 'block';
    document.getElementById('relativo2').style.display = 'none';
}	
	if(document.getElementById('selPag').value == 3) {
    document.getElementById('relativo').style.display = 'none';
    document.getElementById('relativo1').style.display = 'none';
    document.getElementById('relativo2').style.display = 'block';
}	
	if(document.getElementById('selPag').value == 0) {
    document.getElementById('relativo').style.display = 'none';
    document.getElementById('relativo1').style.display = 'none';
    document.getElementById('relativo2').style.display = 'none';
}	

}  
