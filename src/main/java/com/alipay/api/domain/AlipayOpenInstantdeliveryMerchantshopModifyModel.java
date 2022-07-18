package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 即时配送商家门店更新
 *
 * @author auto create
 * @since 1.0, 2020-09-27 21:07:26
 */
public class AlipayOpenInstantdeliveryMerchantshopModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5832948896696749879L;

	/**
	 * 联系人姓名
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 要更新的配送公司列表，必须包含已经创建过该门店的配送公司，可以新增开通了账户的配送公司
	 */
	@ApiListField("logistics_codes")
	@ApiField("string")
	private List<String> logisticsCodes;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 联系人电话/手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 商家门店编码
	 */
	@ApiField("shop_no")
	private String shopNo;

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public List<String> getLogisticsCodes() {
		return this.logisticsCodes;
	}
	public void setLogisticsCodes(List<String> logisticsCodes) {
		this.logisticsCodes = logisticsCodes;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getShopNo() {
		return this.shopNo;
	}
	public void setShopNo(String shopNo) {
		this.shopNo = shopNo;
	}

}
