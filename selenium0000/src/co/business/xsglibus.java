package co.business;

import co.page.xsBan;
import co.page.xsBus;

public class xsglibus{
	xsBan aa=new xsBan();
	xsBus bb=new xsBus();
	public void xsxzgl() throws InterruptedException {
		aa.openurl();
		aa.setusername();
		aa.selectlx();
		Thread.sleep(9000);
		aa.clicklogin();
		bb.zb();
		aa.xs();
		bb.fhui();
		bb.yb();
		aa.xzxs();
		aa.xsxx("wsm");
	}
}
