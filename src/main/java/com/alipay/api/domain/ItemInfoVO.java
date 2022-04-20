package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 推荐元素列表
 *
 * @author auto create
 * @since 1.0, 2020-08-18 20:14:12
 */
public class ItemInfoVO extends AlipayObject {

	private static final long serialVersionUID = 5753954229952395838L;

	/**
	 * 描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 距离
	 */
	@ApiField("distance")
	private String distance;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private EduTrainExtInfo extInfo;

	/**
	 * 所属一级分类列表
	 */
	@ApiListField("first_cates")
	@ApiField("cate_info_v_o")
	private List<CateInfoVO> firstCates;

	/**
	 * serviceCode
	 */
	@ApiField("id")
	private String id;

	/**
	 * 热门
	 */
	@ApiField("is_hot")
	private String isHot;

	/**
	 * 图片
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 标题
	 */
	@ApiField("name")
	private String name;

	/**
	 * 原价
	 */
	@ApiField("ori_price")
	private String oriPrice;

	/**
	 * 父元素信息
	 */
	@ApiField("p_item_info")
	private PItemInfoVO pItemInfo;

	/**
	 * 位置
	 */
	@ApiField("position")
	private String position;

	/**
	 * 价格、人均消费
	 */
	@ApiField("price")
	private String price;

	/**
	 * scm埋点，前端埋点使用
	 */
	@ApiField("scm")
	private String scm;

	/**
	 * 所属二级分类列表
	 */
	@ApiListField("secend_cates")
	@ApiField("cate_info_v_o")
	private List<CateInfoVO> secendCates;

	/**
	 * 来源标识
支付宝：ALIPAY
淘宝：TB
口碑：KB
饿了么：ELM
	 */
	@ApiField("source_type")
	private String sourceType;

	/**
	 * 标签
	 */
	@ApiListField("tags")
	@ApiField("string")
	private List<String> tags;

	/**
	 * 时间
	 */
	@ApiField("time")
	private String time;

	/**
	 * 提示信息
如：活动优惠信息列表
	 */
	@ApiListField("tips")
	@ApiField("string")
	private List<String> tips;

	/**
	 * 链接
	 */
	@ApiField("url")
	private String url;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getDistance() {
		return this.distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}

	public EduTrainExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(EduTrainExtInfo extInfo) {
		this.extInfo = extInfo;
	}

	public List<CateInfoVO> getFirstCates() {
		return this.firstCates;
	}
	public void setFirstCates(List<CateInfoVO> firstCates) {
		this.firstCates = firstCates;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getIsHot() {
		return this.isHot;
	}
	public void setIsHot(String isHot) {
		this.isHot = isHot;
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

	public String getOriPrice() {
		return this.oriPrice;
	}
	public void setOriPrice(String oriPrice) {
		this.oriPrice = oriPrice;
	}

	public PItemInfoVO getpItemInfo() {
		return this.pItemInfo;
	}
	public void setpItemInfo(PItemInfoVO pItemInfo) {
		this.pItemInfo = pItemInfo;
	}

	public String getPosition() {
		return this.position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getScm() {
		return this.scm;
	}
	public void setScm(String scm) {
		this.scm = scm;
	}

	public List<CateInfoVO> getSecendCates() {
		return this.secendCates;
	}
	public void setSecendCates(List<CateInfoVO> secendCates) {
		this.secendCates = secendCates;
	}

	public String getSourceType() {
		return this.sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public List<String> getTags() {
		return this.tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public String getTime() {
		return this.time;
	}
	public void setTime(String time) {
		this.time = time;
	}

	public List<String> getTips() {
		return this.tips;
	}
	public void setTips(List<String> tips) {
		this.tips = tips;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
