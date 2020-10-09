package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询推荐列表
 *
 * @author auto create
 * @since 1.0, 2020-08-19 20:13:27
 */
public class AlipayCommerceEducateTrainRecommendQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1225751583253783759L;

	/**
	 * 业务定制参数
	 */
	@ApiField("biz_ext_info")
	private EduTrainExtInfo bizExtInfo;

	/**
	 * 学段编码
	 */
	@ApiField("first_cate")
	private String firstCate;

	/**
	 * 页数（默认1）
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/**
	 * 页大小(默认20，上限50)
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 产品码
教育缴费：EDU_PAY
支课堂教培：EDU_TRAIN
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 算法定制参数
	 */
	@ApiField("rec_ext_info")
	private EduTrainExtInfo recExtInfo;

	/**
	 * 场景码
支课堂：education_course_rec
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 类目编码
	 */
	@ApiField("secend_cate")
	private String secendCate;

	/**
	 * 子产品码
教育缴费-支付成功页：PAY_SUCCESS
教育缴费-账单详情页：BILL_DETAIL
支课堂-教培课程：TRAIN_COURSE
	 */
	@ApiField("sub_product_code")
	private String subProductCode;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public EduTrainExtInfo getBizExtInfo() {
		return this.bizExtInfo;
	}
	public void setBizExtInfo(EduTrainExtInfo bizExtInfo) {
		this.bizExtInfo = bizExtInfo;
	}

	public String getFirstCate() {
		return this.firstCate;
	}
	public void setFirstCate(String firstCate) {
		this.firstCate = firstCate;
	}

	public Long getPageIndex() {
		return this.pageIndex;
	}
	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public EduTrainExtInfo getRecExtInfo() {
		return this.recExtInfo;
	}
	public void setRecExtInfo(EduTrainExtInfo recExtInfo) {
		this.recExtInfo = recExtInfo;
	}

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	public String getSecendCate() {
		return this.secendCate;
	}
	public void setSecendCate(String secendCate) {
		this.secendCate = secendCate;
	}

	public String getSubProductCode() {
		return this.subProductCode;
	}
	public void setSubProductCode(String subProductCode) {
		this.subProductCode = subProductCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
