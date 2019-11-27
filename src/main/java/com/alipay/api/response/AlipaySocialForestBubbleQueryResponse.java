package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.forest.bubble.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-31 14:41:33
 */
public class AlipaySocialForestBubbleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8379584234518847295L;

	/** 
	 * 业务触发生成能量时间
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/** 
	 * 业务能量类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 气泡值
	 */
	@ApiField("full_energy")
	private Long fullEnergy;

	/** 
	 * 气泡生成时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 气泡更新时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 气泡成熟时间
	 */
	@ApiField("produce_time")
	private Date produceTime;

	/** 
	 * 气泡可见时间
	 */
	@ApiField("show_time")
	private Date showTime;

	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}
	public Date getBizTime( ) {
		return this.bizTime;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

	public void setFullEnergy(Long fullEnergy) {
		this.fullEnergy = fullEnergy;
	}
	public Long getFullEnergy( ) {
		return this.fullEnergy;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
	public Date getGmtModified( ) {
		return this.gmtModified;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setProduceTime(Date produceTime) {
		this.produceTime = produceTime;
	}
	public Date getProduceTime( ) {
		return this.produceTime;
	}

	public void setShowTime(Date showTime) {
		this.showTime = showTime;
	}
	public Date getShowTime( ) {
		return this.showTime;
	}

}
