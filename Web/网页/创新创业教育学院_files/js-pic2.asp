
				var config='4|0xffffff|0x666666|60|0xFDA7CC|0x666666|0x000000';
				var files='',links='', texts='';
				files+='|http://cxcy.gcp.edu.cn/edit/uploadfile/201711/2017-11-20-18-21-54.jpg|/edit/uploadfile/201711/2017-11-9-10-2-42.jpg|/edit/uploadfile/201711/2017-11-9-10-13-45.jpg|/edit/uploadfile/201711/2017-11-9-10-6-42.jpg';links+='|/News_View.asp?newsid=708|/News_View.asp?newsid=685|/News_View.asp?newsid=682|/News_View.asp?newsid=675';texts+='|��Ժ������ְԺУ���´�ҵ���������Ƚ���λ|�ƻ����ϵ�ٰ조��ѧ����ҵ����֧����Ϲ���չ�����|��Ժ���´�ҵѧ���Ŷ�E&#8226;WORKER����Һ��ر���|��Ժ�μ�2016�����������У���´�ҵ�����ɹ�չ';

				files=files.substring(1);links=links.substring(1);texts=texts.substring(1);
				document.write('<object classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000" codebase="http://fpdownload.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=6,0,0,0" width="490" height="400">');
				document.write('<param name="movie" value="/playswf.swf" />');
				document.write('<param name="quality" value="high" />');
				document.write('<param name="menu" value="false" />');
				document.write('<param name=wmode value="opaque" />');
				document.write('<param name="FlashVars" value="config='+config+'&bcastr_flie='+files+'&bcastr_link='+links+'&bcastr_title='+texts+'" />');
				document.write('<embed src="/playswf.swf" wmode="opaque" FlashVars="config='+config+'&bcastr_flie='+files+'&bcastr_link='+links+'&bcastr_title='+texts+'" menu="false" quality="high" width="490" height="400" type="application/x-shockwave-flash" pluginspage="http://www.macromedia.com/go/getflashplayer" />');
				document.write('</object>');

