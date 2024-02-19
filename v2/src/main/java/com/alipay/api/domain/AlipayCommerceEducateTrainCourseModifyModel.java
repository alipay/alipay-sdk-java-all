package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 课程信息修改
 *
 * @author auto create
 * @since 1.0, 2021-03-10 20:55:08
 */
public class AlipayCommerceEducateTrainCourseModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5191474232594145713L;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 课程简介
	 */
	@ApiField("brief")
	private String brief;

	/**
	 * 分类信息(从分类列表接口选取)
	 */
	@ApiListField("cate_infos")
	@ApiField("cate_info")
	private List<CateInfo> cateInfos;

	/**
	 * 支付宝内部课程id
	 */
	@ApiField("course_id")
	private String courseId;

	/**
	 * 课程详情
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 商家信息
	 */
	@ApiField("merchant_info")
	private ShopMerchantInfo merchantInfo;

	/**
	 * 课程名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 上课时间
	 */
	@ApiField("open_time")
	private String openTime;

	/**
	 * 外部课程id
	 */
	@ApiField("out_course_id")
	private String outCourseId;

	/**
	 * 课程主图
	 */
	@ApiField("pic")
	private String pic;

	/**
	 * 场景类型(ONLINE : 线上、OFFLINE : 线下)
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 课程SKU信息
	 */
	@ApiListField("sku_infos")
	@ApiField("course_s_k_u_info")
	private List<CourseSKUInfo> skuInfos;

	/**
	 * 来源(XIAOBAO : 校宝)
	 */
	@ApiField("source_type")
	private String sourceType;

	/**
	 * 标签列表
	 */
	@ApiListField("tag_infos")
	@ApiField("course_tag_info")
	private List<CourseTagInfo> tagInfos;

	/**
	 * 详情页地址
	 */
	@ApiField("url")
	private String url;

	/**
	 * 主视频地址
	 */
	@ApiField("video")
	private String video;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBrief() {
		return this.brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}

	public List<CateInfo> getCateInfos() {
		return this.cateInfos;
	}
	public void setCateInfos(List<CateInfo> cateInfos) {
		this.cateInfos = cateInfos;
	}

	public String getCourseId() {
		return this.courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public ShopMerchantInfo getMerchantInfo() {
		return this.merchantInfo;
	}
	public void setMerchantInfo(ShopMerchantInfo merchantInfo) {
		this.merchantInfo = merchantInfo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOpenTime() {
		return this.openTime;
	}
	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

	public String getOutCourseId() {
		return this.outCourseId;
	}
	public void setOutCourseId(String outCourseId) {
		this.outCourseId = outCourseId;
	}

	public String getPic() {
		return this.pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

	public List<CourseSKUInfo> getSkuInfos() {
		return this.skuInfos;
	}
	public void setSkuInfos(List<CourseSKUInfo> skuInfos) {
		this.skuInfos = skuInfos;
	}

	public String getSourceType() {
		return this.sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public List<CourseTagInfo> getTagInfos() {
		return this.tagInfos;
	}
	public void setTagInfos(List<CourseTagInfo> tagInfos) {
		this.tagInfos = tagInfos;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public String getVideo() {
		return this.video;
	}
	public void setVideo(String video) {
		this.video = video;
	}

}
