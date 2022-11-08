package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建卡模版
 *
 * @author auto create
 * @since 1.0, 2022-11-04 10:31:43
 */
public class AlipayUserCardTemplateCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1643639263259611657L;

	/**
	 * background_url：在支付宝卡包展示的背景图片地址，通过alipay.offline.material.image.upload接口上传图片资源获取(https://opendocs.alipay.com/open/02qth8)
	 */
	@ApiField("background_url")
	private String backgroundUrl;

	/**
	 * banner_image_url：在支付宝卡包展示的banner图片地址，url通过alipay.offline.material.image.upload接口上传图片资源获取(https://opendocs.alipay.com/open/02qth8)
	 */
	@ApiField("banner_image_url")
	private String bannerImageUrl;

	/**
	 * banner_url：用户在支付宝卡包，店家卡banner后的跳转服务地址
	 */
	@ApiField("banner_url")
	private String bannerUrl;

	/**
	 * code_type:码类型
	 */
	@ApiField("code_type")
	private String codeType;

	/**
	 * date_type：卡的有效期类型，如果永久有效则填写PERMANENT，如果一段时间内有效则填写PERIOD
	 */
	@ApiField("date_type")
	private String dateType;

	/**
	 * description：可填写卡的使用规则、注意事项等
	 */
	@ApiField("description")
	private String description;

	/**
	 * logo_url：在支付宝卡包展示的logo地址，通过alipay.offline.material.image.upload接口上传图片资源获取(https://opendocs.alipay.com/open/02qth8)
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * need_balance：卡是否有余额属性
	 */
	@ApiField("need_balance")
	private Boolean needBalance;

	/**
	 * need_level：卡是否有等级属性
	 */
	@ApiField("need_level")
	private Boolean needLevel;

	/**
	 * need_point：卡是否有积分属性
	 */
	@ApiField("need_point")
	private Boolean needPoint;

	/**
	 * point_display_name：积分属性在卡包里展示的名称，默认值为积分
	 */
	@ApiField("point_display_name")
	private String pointDisplayName;

	/**
	 * private_card_page_url：用户在支付宝卡包，点击会员卡cell，跳转的私域卡详情页地址
	 */
	@ApiField("private_card_page_url")
	private String privateCardPageUrl;

	/**
	 * quick_services：卡的快捷服务，快捷服务数量限制为[1,3]
	 */
	@ApiListField("quick_services")
	@ApiField("card_quick_service_d_t_o")
	private List<CardQuickServiceDTO> quickServices;

	/**
	 * service_phone：卡服务电话
	 */
	@ApiField("service_phone")
	private String servicePhone;

	/**
	 * sub_title:在支付宝卡包中展示的卡副标题
	 */
	@ApiField("sub_title")
	private String subTitle;

	/**
	 * title:在支付宝卡包中展示的卡名称
	 */
	@ApiField("title")
	private String title;

	public String getBackgroundUrl() {
		return this.backgroundUrl;
	}
	public void setBackgroundUrl(String backgroundUrl) {
		this.backgroundUrl = backgroundUrl;
	}

	public String getBannerImageUrl() {
		return this.bannerImageUrl;
	}
	public void setBannerImageUrl(String bannerImageUrl) {
		this.bannerImageUrl = bannerImageUrl;
	}

	public String getBannerUrl() {
		return this.bannerUrl;
	}
	public void setBannerUrl(String bannerUrl) {
		this.bannerUrl = bannerUrl;
	}

	public String getCodeType() {
		return this.codeType;
	}
	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public String getDateType() {
		return this.dateType;
	}
	public void setDateType(String dateType) {
		this.dateType = dateType;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public Boolean getNeedBalance() {
		return this.needBalance;
	}
	public void setNeedBalance(Boolean needBalance) {
		this.needBalance = needBalance;
	}

	public Boolean getNeedLevel() {
		return this.needLevel;
	}
	public void setNeedLevel(Boolean needLevel) {
		this.needLevel = needLevel;
	}

	public Boolean getNeedPoint() {
		return this.needPoint;
	}
	public void setNeedPoint(Boolean needPoint) {
		this.needPoint = needPoint;
	}

	public String getPointDisplayName() {
		return this.pointDisplayName;
	}
	public void setPointDisplayName(String pointDisplayName) {
		this.pointDisplayName = pointDisplayName;
	}

	public String getPrivateCardPageUrl() {
		return this.privateCardPageUrl;
	}
	public void setPrivateCardPageUrl(String privateCardPageUrl) {
		this.privateCardPageUrl = privateCardPageUrl;
	}

	public List<CardQuickServiceDTO> getQuickServices() {
		return this.quickServices;
	}
	public void setQuickServices(List<CardQuickServiceDTO> quickServices) {
		this.quickServices = quickServices;
	}

	public String getServicePhone() {
		return this.servicePhone;
	}
	public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}

	public String getSubTitle() {
		return this.subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
