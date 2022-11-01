package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗月月付支付鉴权接口
 *
 * @author auto create
 * @since 1.0, 2021-03-10 10:57:52
 */
public class AlipayPcreditHuabeiSpayAuthConsultModel extends AlipayObject {

	private static final long serialVersionUID = 8725368872945426597L;

	/**
	 * 月月付的资产编码类型；月月付接口，此处必须传：ALICREDITFF
	 */
	@ApiField("asset_type_code")
	private String assetTypeCode;

	/**
	 * 月月付业务类型，目前只有一个有效值：MONTH
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 业务场景：
hbff.stanard.other 淘外标准版（默认）
hbff.stanard.telecom 淘外运营商合约购
	 */
	@ApiField("business_code")
	private String businessCode;

	/**
	 * 鉴权请求扩展信息；
	 */
	@ApiField("ext_infos")
	private ExtInfos extInfos;

	/**
	 * 费用的承担比例，目前没有启用。
	 */
	@ApiField("fee_rate_percent")
	private String feeRatePercent;

	/**
	 * 费用的收费主体；目前没有启用。
	 */
	@ApiField("fee_taker_role")
	private String feeTakerRole;

	/**
	 * 商户和蚂蚁的对接模式，直连模式用：DIRECT_LINK
	 */
	@ApiField("link_mode")
	private String linkMode;

	/**
	 * 商户的身份信息
	 */
	@ApiField("merchant")
	private MerchantIDInfo merchant;

	/**
	 * PAY_MONTHLY表达按月均匀支付；
	 */
	@ApiField("payment_mode")
	private String paymentMode;

	/**
	 * RECEIVE_IN_ONE_TIME:表达一次性提前收款服务
RECEIVE_BY_PERIOD:按照周期收款
	 */
	@ApiField("receive_mode")
	private String receiveMode;

	/**
	 * 分次支付的次数，必须为整数，目前支支持传入10
	 */
	@ApiField("total_install_num")
	private Long totalInstallNum;

	/**
	 * 支付总金额，不是单期支付金额，单位为元；最多支持小数点后面2位小数；
	 */
	@ApiField("total_payment_amount")
	private String totalPaymentAmount;

	/**
	 * 用户身份信息，蚂蚁统一会员ID user_id、蚂蚁会员登录ID login_id（邮箱、手机号），此字段中user_id、login_id和user_id字段三选一必传
	 */
	@ApiField("user")
	private UserDInfo user;

	/**
	 * 买家的蚂蚁统一会员ID，建议使用新的 user字段，当前字段仍然保持兼容支持；此字段和user字段中user_id、login_id三选一必传
	 */
	@ApiField("user_id")
	private String userId;

	public String getAssetTypeCode() {
		return this.assetTypeCode;
	}
	public void setAssetTypeCode(String assetTypeCode) {
		this.assetTypeCode = assetTypeCode;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBusinessCode() {
		return this.businessCode;
	}
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}

	public ExtInfos getExtInfos() {
		return this.extInfos;
	}
	public void setExtInfos(ExtInfos extInfos) {
		this.extInfos = extInfos;
	}

	public String getFeeRatePercent() {
		return this.feeRatePercent;
	}
	public void setFeeRatePercent(String feeRatePercent) {
		this.feeRatePercent = feeRatePercent;
	}

	public String getFeeTakerRole() {
		return this.feeTakerRole;
	}
	public void setFeeTakerRole(String feeTakerRole) {
		this.feeTakerRole = feeTakerRole;
	}

	public String getLinkMode() {
		return this.linkMode;
	}
	public void setLinkMode(String linkMode) {
		this.linkMode = linkMode;
	}

	public MerchantIDInfo getMerchant() {
		return this.merchant;
	}
	public void setMerchant(MerchantIDInfo merchant) {
		this.merchant = merchant;
	}

	public String getPaymentMode() {
		return this.paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getReceiveMode() {
		return this.receiveMode;
	}
	public void setReceiveMode(String receiveMode) {
		this.receiveMode = receiveMode;
	}

	public Long getTotalInstallNum() {
		return this.totalInstallNum;
	}
	public void setTotalInstallNum(Long totalInstallNum) {
		this.totalInstallNum = totalInstallNum;
	}

	public String getTotalPaymentAmount() {
		return this.totalPaymentAmount;
	}
	public void setTotalPaymentAmount(String totalPaymentAmount) {
		this.totalPaymentAmount = totalPaymentAmount;
	}

	public UserDInfo getUser() {
		return this.user;
	}
	public void setUser(UserDInfo user) {
		this.user = user;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
