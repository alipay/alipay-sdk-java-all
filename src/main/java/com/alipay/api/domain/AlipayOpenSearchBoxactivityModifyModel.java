package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 搜索直达活动修改
 *
 * @author auto create
 * @since 1.0, 2022-08-09 11:07:10
 */
public class AlipayOpenSearchBoxactivityModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8343252344555463285L;

	/**
	 * 活动链接，必须为关联的小程序的页面链接（链接以 alipays 开头），可参考<a href="https://opendocs.alipay.com/support/01rb18"> 小程序scheme链接介绍 </a>
	 */
	@ApiField("action_url")
	private String actionUrl;

	/**
	 * 搜索直达活动id
	 */
	@ApiField("box_activity_id")
	private String boxActivityId;

	/**
	 * 活动结束时间，开始时间和结束时间之间不能超过90天
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 当material_type="IMAGE"时，为图片id；当material_type="VIDEO"时，为视频id。图片id可以通过调用接口alipay.open.file.upload上传图片，获取图片id(bizCode：search_box_banner)。规范详情可查看 <a href="https://opendocs.alipay.com/b/03al6f"> 图片规范 </a>。
	 */
	@ApiField("material_id")
	private String materialId;

	/**
	 * IMAGE-图片/VIDEO-视频
	 */
	@ApiField("material_type")
	private String materialType;

	/**
	 * 商户id，代运营模式下传入。代运营模式，需要服务商已获得商家"运营支付宝小程序"授权。
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 活动开始时间，开始时间和结束时间之间不能超过90天
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 跳转应用ID
	 */
	@ApiField("target_appid")
	private String targetAppid;

	/**
	 * 跳转小程序名称
	 */
	@ApiField("target_appname")
	private String targetAppname;

	/**
	 * 投放目标区域列表
	 */
	@ApiListField("target_regions")
	@ApiField("delivery_target_region")
	private List<DeliveryTargetRegion> targetRegions;

	/**
	 * 活动标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 活动视频信息
	 */
	@ApiField("video_info")
	private SearchBoxActivityVideoInfo videoInfo;

	public String getActionUrl() {
		return this.actionUrl;
	}
	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

	public String getBoxActivityId() {
		return this.boxActivityId;
	}
	public void setBoxActivityId(String boxActivityId) {
		this.boxActivityId = boxActivityId;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getMaterialId() {
		return this.materialId;
	}
	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}

	public String getMaterialType() {
		return this.materialType;
	}
	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getTargetAppid() {
		return this.targetAppid;
	}
	public void setTargetAppid(String targetAppid) {
		this.targetAppid = targetAppid;
	}

	public String getTargetAppname() {
		return this.targetAppname;
	}
	public void setTargetAppname(String targetAppname) {
		this.targetAppname = targetAppname;
	}

	public List<DeliveryTargetRegion> getTargetRegions() {
		return this.targetRegions;
	}
	public void setTargetRegions(List<DeliveryTargetRegion> targetRegions) {
		this.targetRegions = targetRegions;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public SearchBoxActivityVideoInfo getVideoInfo() {
		return this.videoInfo;
	}
	public void setVideoInfo(SearchBoxActivityVideoInfo videoInfo) {
		this.videoInfo = videoInfo;
	}

}
