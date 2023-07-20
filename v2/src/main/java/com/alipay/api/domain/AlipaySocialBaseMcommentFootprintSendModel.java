package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝收藏足迹上报接口
 *
 * @author auto create
 * @since 1.0, 2023-03-09 21:46:53
 */
public class AlipaySocialBaseMcommentFootprintSendModel extends AlipayObject {

	private static final long serialVersionUID = 5482414229639783915L;

	/**
	 * 足迹服务分配的业务码
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 扩展字段，某些特殊业务需要传，JSON格式
	 */
	@ApiField("ext_data")
	private String extData;

	/**
	 * 足迹内容的模版号
	 */
	@ApiField("footprint_model_code")
	private String footprintModelCode;

	/**
	 * 模板内容，JSON格式
	 */
	@ApiField("footprint_model_data")
	private String footprintModelData;

	/**
	 * 产生足迹的unix毫秒时间戳
	 */
	@ApiField("footprint_time")
	private Long footprintTime;

	/**
	 * 业务场景下的唯一键，例如店铺id，访问对象的id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 用于openId的改造，将openId转成支付宝内部的userId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 上报数据来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getExtData() {
		return this.extData;
	}
	public void setExtData(String extData) {
		this.extData = extData;
	}

	public String getFootprintModelCode() {
		return this.footprintModelCode;
	}
	public void setFootprintModelCode(String footprintModelCode) {
		this.footprintModelCode = footprintModelCode;
	}

	public String getFootprintModelData() {
		return this.footprintModelData;
	}
	public void setFootprintModelData(String footprintModelData) {
		this.footprintModelData = footprintModelData;
	}

	public Long getFootprintTime() {
		return this.footprintTime;
	}
	public void setFootprintTime(Long footprintTime) {
		this.footprintTime = footprintTime;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
