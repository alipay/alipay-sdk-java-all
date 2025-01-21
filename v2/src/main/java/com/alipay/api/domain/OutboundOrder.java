package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出库通知单
 *
 * @author auto create
 * @since 1.0, 2018-06-01 17:19:09
 */
public class OutboundOrder extends AlipayObject {

	private static final long serialVersionUID = 7551965558899593921L;

	/**
	 * 扩展字段，json格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 外部业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 出库业务类型，CGCK=采购出库，DDCK=订单出库，PDCK=盘点出库
	 */
	@ApiField("outbound_type")
	private String outboundType;

	/**
	 * 收货人信息（商家采购必须传，其他订单类型非必传）
	 */
	@ApiField("receiver_info_vo")
	private ReceiverInfoVO receiverInfoVo;

	/**
	 * 备注信息。
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 发货人信息
	 */
	@ApiField("sender_info_vo")
	private SenderInfoVO senderInfoVo;

	/**
	 * 仓库编号
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutboundType() {
		return this.outboundType;
	}
	public void setOutboundType(String outboundType) {
		this.outboundType = outboundType;
	}

	public ReceiverInfoVO getReceiverInfoVo() {
		return this.receiverInfoVo;
	}
	public void setReceiverInfoVo(ReceiverInfoVO receiverInfoVo) {
		this.receiverInfoVo = receiverInfoVo;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public SenderInfoVO getSenderInfoVo() {
		return this.senderInfoVo;
	}
	public void setSenderInfoVo(SenderInfoVO senderInfoVo) {
		this.senderInfoVo = senderInfoVo;
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

}
