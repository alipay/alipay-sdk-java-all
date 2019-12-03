package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券模板创建信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class VoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 6123152787528448174L;

	/**
	 * 是否可转赠。默认true
	 */
	@ApiField("can_give_friend")
	private Boolean canGiveFriend;

	/**
	 * 使用规则
	 */
	@ApiField("use_rule")
	private UseRuleInfo useRule;

	/**
	 * 有效期
	 */
	@ApiField("valid_date")
	private ValidDateInfo validDate;

	/**
	 * 券详情描述
	 */
	@ApiField("voucher_desc")
	private String voucherDesc;

	/**
	 * 券背景图。该值调用接口:alipay.offline.material.image.upload生成
	 */
	@ApiField("voucher_img")
	private String voucherImg;

	/**
	 * logo图片id。该值调用接口:alipay.offline.material.image.upload生成
	 */
	@ApiField("voucher_logo")
	private String voucherLogo;

	/**
	 * 券名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/**
	 * 券上的详情描述信息
	 */
	@ApiListField("voucher_terms")
	@ApiField("voucher_term_info")
	private List<VoucherTermInfo> voucherTerms;

	/**
	 * 券类型
	 */
	@ApiField("voucher_type")
	private String voucherType;

	public Boolean getCanGiveFriend() {
		return this.canGiveFriend;
	}
	public void setCanGiveFriend(Boolean canGiveFriend) {
		this.canGiveFriend = canGiveFriend;
	}

	public UseRuleInfo getUseRule() {
		return this.useRule;
	}
	public void setUseRule(UseRuleInfo useRule) {
		this.useRule = useRule;
	}

	public ValidDateInfo getValidDate() {
		return this.validDate;
	}
	public void setValidDate(ValidDateInfo validDate) {
		this.validDate = validDate;
	}

	public String getVoucherDesc() {
		return this.voucherDesc;
	}
	public void setVoucherDesc(String voucherDesc) {
		this.voucherDesc = voucherDesc;
	}

	public String getVoucherImg() {
		return this.voucherImg;
	}
	public void setVoucherImg(String voucherImg) {
		this.voucherImg = voucherImg;
	}

	public String getVoucherLogo() {
		return this.voucherLogo;
	}
	public void setVoucherLogo(String voucherLogo) {
		this.voucherLogo = voucherLogo;
	}

	public String getVoucherName() {
		return this.voucherName;
	}
	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}

	public List<VoucherTermInfo> getVoucherTerms() {
		return this.voucherTerms;
	}
	public void setVoucherTerms(List<VoucherTermInfo> voucherTerms) {
		this.voucherTerms = voucherTerms;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

}
