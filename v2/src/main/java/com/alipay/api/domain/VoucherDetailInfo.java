package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券资产详情信息对象
 *
 * @author auto create
 * @since 1.0, 2018-01-15 17:47:56
 */
public class VoucherDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 8761871492811445883L;

	/**
	 * 资产id
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * 资产生效时间
	 */
	@ApiField("effect_time")
	private String effectTime;

	/**
	 * 扩展字段信息，通过map存储的json串
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 不可用时间段（只支持到天）
	 */
	@ApiField("forbbiden_time")
	private ForbbidenTime forbbidenTime;

	/**
	 * 资产过期时间
	 */
	@ApiField("invalid_time")
	private String invalidTime;

	/**
	 * 单品id中间用“,”分隔
	 */
	@ApiField("sku_codes")
	private String skuCodes;

	/**
	 * 可用时段条款
	 */
	@ApiListField("time_rules")
	@ApiField("use_time")
	private List<UseTime> timeRules;

	/**
	 * 券使用条件
	 */
	@ApiField("use_condition")
	private String useCondition;

	/**
	 * 全资产描述
	 */
	@ApiField("voucher_desc")
	private String voucherDesc;

	/**
	 * 券类型(ALIPAY_FIX_VOUCHER:全场券；ALIPAY_ITEM_VOUCHER：单品券,KOUBEI_BUY_EXCHANGE_VOUCHER:兑换券)
	 */
	@ApiField("voucher_type")
	private String voucherType;

	public String getAssetId() {
		return this.assetId;
	}
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public String getEffectTime() {
		return this.effectTime;
	}
	public void setEffectTime(String effectTime) {
		this.effectTime = effectTime;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public ForbbidenTime getForbbidenTime() {
		return this.forbbidenTime;
	}
	public void setForbbidenTime(ForbbidenTime forbbidenTime) {
		this.forbbidenTime = forbbidenTime;
	}

	public String getInvalidTime() {
		return this.invalidTime;
	}
	public void setInvalidTime(String invalidTime) {
		this.invalidTime = invalidTime;
	}

	public String getSkuCodes() {
		return this.skuCodes;
	}
	public void setSkuCodes(String skuCodes) {
		this.skuCodes = skuCodes;
	}

	public List<UseTime> getTimeRules() {
		return this.timeRules;
	}
	public void setTimeRules(List<UseTime> timeRules) {
		this.timeRules = timeRules;
	}

	public String getUseCondition() {
		return this.useCondition;
	}
	public void setUseCondition(String useCondition) {
		this.useCondition = useCondition;
	}

	public String getVoucherDesc() {
		return this.voucherDesc;
	}
	public void setVoucherDesc(String voucherDesc) {
		this.voucherDesc = voucherDesc;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

}
