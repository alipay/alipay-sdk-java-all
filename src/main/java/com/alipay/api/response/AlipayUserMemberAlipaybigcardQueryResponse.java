package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BigCardData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.member.alipaybigcard.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-06-17 15:02:26
 */
public class AlipayUserMemberAlipaybigcardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8817571754332223581L;

	/** 
	 * 支付宝大卡片展现信息（缓存类），缓存类是对实时性要求不高的透出内容。缓存类用于存在缓存中，在调用接口超时或者降级时取用。
	 */
	@ApiField("alipay_big_card_cache_data")
	private BigCardData alipayBigCardCacheData;

	/** 
	 * 支付宝大卡片展现信息（实时），展现层数据信息，结构详见具体复杂类型，返回给用户的卡片展现信息包括实时类和缓存类两部分，实时类是精确信息，直接用于前端展现
	 */
	@ApiField("alipay_big_card_real_time_data")
	private BigCardData alipayBigCardRealTimeData;

	/** 
	 * 可存入缓存的卡片展示信息
	 */
	@ApiField("backup_display_info")
	private String backupDisplayInfo;

	/** 
	 * 工具类或卡片类，single_tool或single_content
	 */
	@ApiField("backup_template_code")
	private String backupTemplateCode;

	/** 
	 * 植入在手淘的埋点信息
	 */
	@ApiField("backup_track_info")
	private String backupTrackInfo;

	/** 
	 * 按照淘宝约定的格式返回的卡片展示结果，json格式
	 */
	@ApiField("display_info")
	private String displayInfo;

	/** 
	 * 扩展字段备用
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 结果描述
	 */
	@ApiField("result_desc")
	private String resultDesc;

	/** 
	 * 业务失败是否可重试
	 */
	@ApiField("retryable")
	private String retryable;

	/** 
	 * 是否业务处理成功
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 工具类或卡片类，single_tool或single_content
	 */
	@ApiField("template_code")
	private String templateCode;

	/** 
	 * 植入在手淘的埋点信息
	 */
	@ApiField("track_info")
	private String trackInfo;

	public void setAlipayBigCardCacheData(BigCardData alipayBigCardCacheData) {
		this.alipayBigCardCacheData = alipayBigCardCacheData;
	}
	public BigCardData getAlipayBigCardCacheData( ) {
		return this.alipayBigCardCacheData;
	}

	public void setAlipayBigCardRealTimeData(BigCardData alipayBigCardRealTimeData) {
		this.alipayBigCardRealTimeData = alipayBigCardRealTimeData;
	}
	public BigCardData getAlipayBigCardRealTimeData( ) {
		return this.alipayBigCardRealTimeData;
	}

	public void setBackupDisplayInfo(String backupDisplayInfo) {
		this.backupDisplayInfo = backupDisplayInfo;
	}
	public String getBackupDisplayInfo( ) {
		return this.backupDisplayInfo;
	}

	public void setBackupTemplateCode(String backupTemplateCode) {
		this.backupTemplateCode = backupTemplateCode;
	}
	public String getBackupTemplateCode( ) {
		return this.backupTemplateCode;
	}

	public void setBackupTrackInfo(String backupTrackInfo) {
		this.backupTrackInfo = backupTrackInfo;
	}
	public String getBackupTrackInfo( ) {
		return this.backupTrackInfo;
	}

	public void setDisplayInfo(String displayInfo) {
		this.displayInfo = displayInfo;
	}
	public String getDisplayInfo( ) {
		return this.displayInfo;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}
	public String getResultDesc( ) {
		return this.resultDesc;
	}

	public void setRetryable(String retryable) {
		this.retryable = retryable;
	}
	public String getRetryable( ) {
		return this.retryable;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}
	public String getTemplateCode( ) {
		return this.templateCode;
	}

	public void setTrackInfo(String trackInfo) {
		this.trackInfo = trackInfo;
	}
	public String getTrackInfo( ) {
		return this.trackInfo;
	}

}
