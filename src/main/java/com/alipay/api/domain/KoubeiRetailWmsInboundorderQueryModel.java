package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 入库通知单查询接口
 *
 * @author auto create
 * @since 1.0, 2018-06-01 17:20:21
 */
public class KoubeiRetailWmsInboundorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8455649897973469713L;

	/**
	 * 入库通知单id（与外部单号二选一，必填其中一个）
	 */
	@ApiField("inbound_order_id")
	private String inboundOrderId;

	/**
	 * 是否需要明细。true返回明细，false不返回。
	 */
	@ApiField("need_detail")
	private Boolean needDetail;

	/**
	 * 外部业务单号（与入库通知单id二选一，必填一个）
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getInboundOrderId() {
		return this.inboundOrderId;
	}
	public void setInboundOrderId(String inboundOrderId) {
		this.inboundOrderId = inboundOrderId;
	}

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

}
