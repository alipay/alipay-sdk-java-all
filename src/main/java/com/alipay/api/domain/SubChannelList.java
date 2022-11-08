package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子渠道模型：当下用于花呗分期每期表达
 *
 * @author auto create
 * @since 1.0, 2021-12-08 14:28:14
 */
public class SubChannelList extends AlipayObject {

	private static final long serialVersionUID = 2451452595816516784L;

	/**
	 * 资产ID
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * 资产类型
	 */
	@ApiField("asset_type")
	private String assetType;

	/**
	 * 资产编码
	 */
	@ApiField("asset_type_code")
	private String assetTypeCode;

	/**
	 * 资产详情扩展参数
	 */
	@ApiField("assets_detail_params")
	private AssetsDetailParams assetsDetailParams;

	/**
	 * 渠道可用额度
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/**
	 * 渠道不可用错误码
	 */
	@ApiField("close_error_code")
	private String closeErrorCode;

	/**
	 * 渠道不可用原因
	 */
	@ApiField("close_error_msg")
	private String closeErrorMsg;

	/**
	 * 渠道索引
	 */
	@ApiField("compatible_channel_index")
	private String compatibleChannelIndex;

	/**
	 * 渠道是否可用
	 */
	@ApiField("enable")
	private Boolean enable;

	/**
	 * 渠道是否足额
	 */
	@ApiField("enough")
	private Boolean enough;

	/**
	 * 机构ID
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 花呗分期期数
	 */
	@ApiField("install_counts")
	private String installCounts;

	/**
	 * 总授信额度：目前仅用与花呗分期
	 */
	@ApiField("limit_amount")
	private String limitAmount;

	/**
	 * 渠道logo图片的url地址
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 资产名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 推荐文案
	 */
	@ApiField("recommend_text")
	private String recommendText;

	/**
	 * 推荐提示文案
	 */
	@ApiField("recommend_tip")
	private String recommendTip;

	/**
	 * 渠道是否已签约
	 */
	@ApiField("signed")
	private Boolean signed;

	public String getAssetId() {
		return this.assetId;
	}
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public String getAssetType() {
		return this.assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getAssetTypeCode() {
		return this.assetTypeCode;
	}
	public void setAssetTypeCode(String assetTypeCode) {
		this.assetTypeCode = assetTypeCode;
	}

	public AssetsDetailParams getAssetsDetailParams() {
		return this.assetsDetailParams;
	}
	public void setAssetsDetailParams(AssetsDetailParams assetsDetailParams) {
		this.assetsDetailParams = assetsDetailParams;
	}

	public String getAvailableAmount() {
		return this.availableAmount;
	}
	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}

	public String getCloseErrorCode() {
		return this.closeErrorCode;
	}
	public void setCloseErrorCode(String closeErrorCode) {
		this.closeErrorCode = closeErrorCode;
	}

	public String getCloseErrorMsg() {
		return this.closeErrorMsg;
	}
	public void setCloseErrorMsg(String closeErrorMsg) {
		this.closeErrorMsg = closeErrorMsg;
	}

	public String getCompatibleChannelIndex() {
		return this.compatibleChannelIndex;
	}
	public void setCompatibleChannelIndex(String compatibleChannelIndex) {
		this.compatibleChannelIndex = compatibleChannelIndex;
	}

	public Boolean getEnable() {
		return this.enable;
	}
	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	public Boolean getEnough() {
		return this.enough;
	}
	public void setEnough(Boolean enough) {
		this.enough = enough;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getInstallCounts() {
		return this.installCounts;
	}
	public void setInstallCounts(String installCounts) {
		this.installCounts = installCounts;
	}

	public String getLimitAmount() {
		return this.limitAmount;
	}
	public void setLimitAmount(String limitAmount) {
		this.limitAmount = limitAmount;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getRecommendText() {
		return this.recommendText;
	}
	public void setRecommendText(String recommendText) {
		this.recommendText = recommendText;
	}

	public String getRecommendTip() {
		return this.recommendTip;
	}
	public void setRecommendTip(String recommendTip) {
		this.recommendTip = recommendTip;
	}

	public Boolean getSigned() {
		return this.signed;
	}
	public void setSigned(Boolean signed) {
		this.signed = signed;
	}

}
