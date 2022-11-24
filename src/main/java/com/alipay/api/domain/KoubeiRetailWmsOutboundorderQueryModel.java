package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出库通知单查询接口
 *
 * @author auto create
 * @since 1.0, 2018-06-01 17:19:51
 */
public class KoubeiRetailWmsOutboundorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4521567556399177766L;

	/**
	 * 是否需要通知单明细，true则返回明细
	 */
	@ApiField("need_detail")
	private Boolean needDetail;

	/**
	 * 外部业务单号（出库通知单id二选一，必填一个）
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 通知单id（与业务单号二选一，必选一个）
	 */
	@ApiField("outbound_order_id")
	private String outboundOrderId;

	public Boolean getNeedDetail() {
		return this.needDetail;
	}
	public void setNeedDetail(Boolean needDetail) {
		this.needDetail = needDetail;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutboundOrderId() {
		return this.outboundOrderId;
	}
	public void setOutboundOrderId(String outboundOrderId) {
		this.outboundOrderId = outboundOrderId;
	}

}
