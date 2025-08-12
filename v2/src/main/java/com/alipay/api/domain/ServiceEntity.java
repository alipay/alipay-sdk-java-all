package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 广告投放实体信息
 *
 * @author auto create
 * @since 1.0, 2025-07-29 16:58:32
 */
public class ServiceEntity extends AlipayObject {

	private static final long serialVersionUID = 3244943668426453988L;

	/**
	 * 商品所属的小程序appId
	 */
	@ApiField("service_entity_app_id")
	private String serviceEntityAppId;

	/**
	 * 商品所属的小程序名称
	 */
	@ApiField("service_entity_app_name")
	private String serviceEntityAppName;

	/**
	 * 小程序的URL
	 */
	@ApiField("service_entity_app_url")
	private String serviceEntityAppUrl;

	/**
	 * 实体描述
	 */
	@ApiField("service_entity_desc")
	private String serviceEntityDesc;

	/**
	 * 商品上绑定的落地也相关信息
	 */
	@ApiListField("service_entity_landing_page")
	@ApiField("landing_type_dto")
	private List<LandingTypeDto> serviceEntityLandingPage;

	/**
	 * 实体名称
	 */
	@ApiField("service_entity_name")
	private String serviceEntityName;

	/**
	 * 实体NO，是一个实体的唯一键
	 */
	@ApiField("service_entity_no")
	private String serviceEntityNo;

	/**
	 * 实体的outId，跟实体类型和实体来源一起组成entity_no
	 */
	@ApiField("service_entity_out_id")
	private String serviceEntityOutId;

	/**
	 * 用于表示实体来源
	 */
	@ApiField("service_entity_out_source")
	private String serviceEntityOutSource;

	/**
	 * 实体主图图片
	 */
	@ApiField("service_entity_picture")
	private String serviceEntityPicture;

	/**
	 * 实体子图图片列表
	 */
	@ApiListField("service_entity_picture_list")
	@ApiField("string")
	private List<String> serviceEntityPictureList;

	/**
	 * 交互落地页URL
	 */
	@ApiField("service_entity_target_url")
	private String serviceEntityTargetUrl;

	/**
	 * 第二落地页:商品提报落地页和官方商详页
	 */
	@ApiField("service_entity_target_url_snd")
	private String serviceEntityTargetUrlSnd;

	/**
	 * 标识实体的类型，可以是电商商品、金融商品、保险服务三种类型
	 */
	@ApiField("service_entity_type")
	private String serviceEntityType;

	/**
	 * 实体视频列表
	 */
	@ApiListField("service_entity_video_list")
	@ApiField("string")
	private List<String> serviceEntityVideoList;

	/**
	 * 实体白底图
	 */
	@ApiField("service_entity_white_picture")
	private String serviceEntityWhitePicture;

	public String getServiceEntityAppId() {
		return this.serviceEntityAppId;
	}
	public void setServiceEntityAppId(String serviceEntityAppId) {
		this.serviceEntityAppId = serviceEntityAppId;
	}

	public String getServiceEntityAppName() {
		return this.serviceEntityAppName;
	}
	public void setServiceEntityAppName(String serviceEntityAppName) {
		this.serviceEntityAppName = serviceEntityAppName;
	}

	public String getServiceEntityAppUrl() {
		return this.serviceEntityAppUrl;
	}
	public void setServiceEntityAppUrl(String serviceEntityAppUrl) {
		this.serviceEntityAppUrl = serviceEntityAppUrl;
	}

	public String getServiceEntityDesc() {
		return this.serviceEntityDesc;
	}
	public void setServiceEntityDesc(String serviceEntityDesc) {
		this.serviceEntityDesc = serviceEntityDesc;
	}

	public List<LandingTypeDto> getServiceEntityLandingPage() {
		return this.serviceEntityLandingPage;
	}
	public void setServiceEntityLandingPage(List<LandingTypeDto> serviceEntityLandingPage) {
		this.serviceEntityLandingPage = serviceEntityLandingPage;
	}

	public String getServiceEntityName() {
		return this.serviceEntityName;
	}
	public void setServiceEntityName(String serviceEntityName) {
		this.serviceEntityName = serviceEntityName;
	}

	public String getServiceEntityNo() {
		return this.serviceEntityNo;
	}
	public void setServiceEntityNo(String serviceEntityNo) {
		this.serviceEntityNo = serviceEntityNo;
	}

	public String getServiceEntityOutId() {
		return this.serviceEntityOutId;
	}
	public void setServiceEntityOutId(String serviceEntityOutId) {
		this.serviceEntityOutId = serviceEntityOutId;
	}

	public String getServiceEntityOutSource() {
		return this.serviceEntityOutSource;
	}
	public void setServiceEntityOutSource(String serviceEntityOutSource) {
		this.serviceEntityOutSource = serviceEntityOutSource;
	}

	public String getServiceEntityPicture() {
		return this.serviceEntityPicture;
	}
	public void setServiceEntityPicture(String serviceEntityPicture) {
		this.serviceEntityPicture = serviceEntityPicture;
	}

	public List<String> getServiceEntityPictureList() {
		return this.serviceEntityPictureList;
	}
	public void setServiceEntityPictureList(List<String> serviceEntityPictureList) {
		this.serviceEntityPictureList = serviceEntityPictureList;
	}

	public String getServiceEntityTargetUrl() {
		return this.serviceEntityTargetUrl;
	}
	public void setServiceEntityTargetUrl(String serviceEntityTargetUrl) {
		this.serviceEntityTargetUrl = serviceEntityTargetUrl;
	}

	public String getServiceEntityTargetUrlSnd() {
		return this.serviceEntityTargetUrlSnd;
	}
	public void setServiceEntityTargetUrlSnd(String serviceEntityTargetUrlSnd) {
		this.serviceEntityTargetUrlSnd = serviceEntityTargetUrlSnd;
	}

	public String getServiceEntityType() {
		return this.serviceEntityType;
	}
	public void setServiceEntityType(String serviceEntityType) {
		this.serviceEntityType = serviceEntityType;
	}

	public List<String> getServiceEntityVideoList() {
		return this.serviceEntityVideoList;
	}
	public void setServiceEntityVideoList(List<String> serviceEntityVideoList) {
		this.serviceEntityVideoList = serviceEntityVideoList;
	}

	public String getServiceEntityWhitePicture() {
		return this.serviceEntityWhitePicture;
	}
	public void setServiceEntityWhitePicture(String serviceEntityWhitePicture) {
		this.serviceEntityWhitePicture = serviceEntityWhitePicture;
	}

}
