package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 入库通知单主体
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:33:41
 */
public class InboundOrder extends AlipayObject {

	private static final long serialVersionUID = 8682251251252751143L;

	/**
	 * 扩展字段，json格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 入库业务类型，BHRK=补货入库，CGRK=采购入库，CGTHRK=采购退货入库，DDTHRK=订单退货入库，PDRK=盘点入库
	 */
	@ApiField("inbound_type")
	private String inboundType;

	/**
	 * 跟此入库通知单关联的外部业务订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 备注信息。
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 发货人信息，供货商补货必传，其他非必传
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

	public String getInboundType() {
		return this.inboundType;
	}
	public void setInboundType(String inboundType) {
		this.inboundType = inboundType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
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
