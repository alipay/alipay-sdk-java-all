package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 输出户号信息
 *
 * @author auto create
 * @since 1.0, 2024-05-27 14:42:41
 */
public class ExportBillkey extends AlipayObject {

	private static final long serialVersionUID = 5352138733565532276L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 户号
	 */
	@ApiField("billkey")
	private String billkey;

	/**
	 * 缴费业务标识
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 支付宝量化机构的标识
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 户名
	 */
	@ApiField("owner_name")
	private String ownerName;

	/**
	 * 缴费子业务标识
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBillkey() {
		return this.billkey;
	}
	public void setBillkey(String billkey) {
		this.billkey = billkey;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getInstCode() {
		return this.instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}

	public String getOwnerName() {
		return this.ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

}
