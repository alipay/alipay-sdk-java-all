package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.user.scene.preconsult response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-18 11:30:17
 */
public class ZhimaCreditPeUserScenePreconsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6435426624799455665L;

	/** 
	 * 极速退开通标识true 开通 false 否
	 */
	@ApiField("accessible")
	private Boolean accessible;

	/** 
	 * 剩余可用额度（场景维度，且只对特定场景开放）
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/** 
	 * 剩余可用件数（场景维度，且只对特定场景开放）
	 */
	@ApiField("available_goods_count")
	private String availableGoodsCount;

	/** 
	 * 买家的蚂蚁统一会员ID
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/** 
	 * 芝麻预咨询单号
	 */
	@ApiField("eval_invoke_id")
	private String evalInvokeId;

	/** 
	 * 场景等级 A,B ,C等,A B C D分别代表业务方不同的差异化服务
	 */
	@ApiField("scene_level")
	private String sceneLevel;

	/** 
	 * 人维度的封顶金额
	 */
	@ApiField("top_amount")
	private String topAmount;

	/** 
	 * 人维度的封顶件数
	 */
	@ApiField("top_goods_count")
	private String topGoodsCount;

	public void setAccessible(Boolean accessible) {
		this.accessible = accessible;
	}
	public Boolean getAccessible( ) {
		return this.accessible;
	}

	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}
	public String getAvailableAmount( ) {
		return this.availableAmount;
	}

	public void setAvailableGoodsCount(String availableGoodsCount) {
		this.availableGoodsCount = availableGoodsCount;
	}
	public String getAvailableGoodsCount( ) {
		return this.availableGoodsCount;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getBuyerId( ) {
		return this.buyerId;
	}

	public void setEvalInvokeId(String evalInvokeId) {
		this.evalInvokeId = evalInvokeId;
	}
	public String getEvalInvokeId( ) {
		return this.evalInvokeId;
	}

	public void setSceneLevel(String sceneLevel) {
		this.sceneLevel = sceneLevel;
	}
	public String getSceneLevel( ) {
		return this.sceneLevel;
	}

	public void setTopAmount(String topAmount) {
		this.topAmount = topAmount;
	}
	public String getTopAmount( ) {
		return this.topAmount;
	}

	public void setTopGoodsCount(String topGoodsCount) {
		this.topGoodsCount = topGoodsCount;
	}
	public String getTopGoodsCount( ) {
		return this.topGoodsCount;
	}

}
