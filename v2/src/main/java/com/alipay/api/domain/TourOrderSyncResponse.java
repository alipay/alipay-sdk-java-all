package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-06-16 16:37:28
 */
public class TourOrderSyncResponse extends AlipayObject {

	private static final long serialVersionUID = 1291158692955438387L;

	/**
	 * 订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 入库业务号
	 */
	@ApiField("vid")
	private String vid;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getVid() {
		return this.vid;
	}
	public void setVid(String vid) {
		this.vid = vid;
	}

}
