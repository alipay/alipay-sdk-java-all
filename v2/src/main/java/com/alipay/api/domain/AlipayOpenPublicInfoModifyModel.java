package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务窗基础信息修改接口
 *
 * @author auto create
 * @since 1.0, 2021-04-23 14:05:48
 */
public class AlipayOpenPublicInfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8873399115526529928L;

	/**
	 * 生活号名称，2-20个字之间。注意：
* 不得含有违反法律法规和公序良俗的相关信息；
* 不得侵害他人名誉权、知识产权、商业秘密等合法权利；
* 不得以太过广泛的、或产品、行业词组来命名，如：女装、皮革批发；
* 不得以实名认证的媒体资质账号创建服务窗，或媒体相关名称命名服务窗，如：XX电视台、XX杂志等。
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 授权运营书图片地址，企业商户若为被经营方授权，需上传加盖公章的扫描件。支持 .jpg、 .jpeg、 .png 格式，需小于1M。使用 <a href="https://opendocs.alipay.com/apis/api_3/alipay.offline.material.image.upload">alipay.offline.material.image.upload</a>(上传门店照片和视频接口)上传图片后，将得到的image_url回填与此处。
	 */
	@ApiField("auth_pic")
	private String authPic;

	/**
	 * 背景图片地址，建议尺寸 1600 x 1000px，支持.jpg .jpeg .png格式，小于1M。使用 <a href="https://opendocs.alipay.com/apis/api_3/alipay.offline.material.image.upload">alipay.offline.material.image.upload</a>(上传门店照片和视频接口)上传图片后，将得到的image_url回填与此处。
	 */
	@ApiField("background_url")
	private String backgroundUrl;

	/**
	 * 简介
	 */
	@ApiField("introduction")
	private String introduction;

	/**
	 * 营业执照地址，建议尺寸 320*320 px，支持 .jpg、 .jpeg、 .png 格式，需小于1M。
使用 <a href="https://opendocs.alipay.com/apis/api_3/alipay.offline.material.image.upload">alipay.offline.material.image.upload</a>(上传门店照片和视频接口)上传图片后，将得到的image_url回填与此处。
	 */
	@ApiField("license_url")
	private String licenseUrl;

	/**
	 * 生活号头像地址，建议尺寸 320*320 px，支持 .jpg、 .jpeg、 .png 格式，需小于1M。
使用 <a href="https://opendocs.alipay.com/apis/api_3/alipay.offline.material.image.upload">alipay.offline.material.image.upload</a>(上传门店照片和视频接口)上传图片后，将得到的image_url回填与此处。
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 欢迎语
	 */
	@ApiField("public_greeting")
	private String publicGreeting;

	/**
	 * 门店照片地址，支持 .jpg、 .jpeg、 .png 格式，需小于1M。
使用 <a href="https://opendocs.alipay.com/apis/api_3/alipay.offline.material.image.upload">alipay.offline.material.image.upload</a>(上传门店照片和视频接口)上传图片后，将得到的image_url回填与此处。
	 */
	@ApiListField("shop_pics")
	@ApiField("string")
	private List<String> shopPics;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAuthPic() {
		return this.authPic;
	}
	public void setAuthPic(String authPic) {
		this.authPic = authPic;
	}

	public String getBackgroundUrl() {
		return this.backgroundUrl;
	}
	public void setBackgroundUrl(String backgroundUrl) {
		this.backgroundUrl = backgroundUrl;
	}

	public String getIntroduction() {
		return this.introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getLicenseUrl() {
		return this.licenseUrl;
	}
	public void setLicenseUrl(String licenseUrl) {
		this.licenseUrl = licenseUrl;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getPublicGreeting() {
		return this.publicGreeting;
	}
	public void setPublicGreeting(String publicGreeting) {
		this.publicGreeting = publicGreeting;
	}

	public List<String> getShopPics() {
		return this.shopPics;
	}
	public void setShopPics(List<String> shopPics) {
		this.shopPics = shopPics;
	}

}
