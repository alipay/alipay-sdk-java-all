package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AI秤-零食场景-识别结果输出
 *
 * @author auto create
 * @since 1.0, 2025-08-11 16:34:09
 */
public class TipIotDeepeyeSnackRecognizePageResVo extends AlipayObject {

	private static final long serialVersionUID = 4786628682216484591L;

	/**
	 * 人机一致率
	 */
	@ApiField("corr_rate")
	private String corrRate;

	/**
	 * 称重商品识别结果与店员反馈一致的次数
	 */
	@ApiField("corr_session_cnt")
	private Long corrSessionCnt;

	/**
	 * 设备数
	 */
	@ApiField("device_cnt")
	private Long deviceCnt;

	/**
	 * 设备ID
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 分析维度
	 */
	@ApiField("dim")
	private String dim;

	/**
	 * 日期
	 */
	@ApiField("dt")
	private String dt;

	/**
	 * 服务商名称
	 */
	@ApiField("isv_name")
	private String isvName;

	/**
	 * isvPid字段存储的是服务商id(isvId)，仅用作返回给外部接口
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 商户数
	 */
	@ApiField("merchant_cnt")
	private Long merchantCnt;

	/**
	 * 商户ID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 仅一次正确识别的会话数量
	 */
	@ApiField("only_1_corr_session_cnt")
	private Long only1CorrSessionCnt;

	/**
	 * 仅一次识别尝试的会话数量
	 */
	@ApiField("only_1_session_cnt")
	private Long only1SessionCnt;

	/**
	 * AI采纳率
	 */
	@ApiField("select_rate")
	private String selectRate;

	/**
	 * 称重商品识别结果被店员采纳的次数
	 */
	@ApiField("selectai_session_cnt")
	private Long selectaiSessionCnt;

	/**
	 * 总识别次数
	 */
	@ApiField("session_cnt")
	private Long sessionCnt;

	/**
	 * 门店数
	 */
	@ApiField("store_cnt")
	private Long storeCnt;

	/**
	 * 门店ID
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 门店名称
	 */
	@ApiField("store_name")
	private String storeName;

	/**
	 * 时间粒度
	 */
	@ApiField("time_period")
	private String timePeriod;

	/**
	 * Top1人机一致率
	 */
	@ApiField("top_1_corr_rate")
	private String top1CorrRate;

	/**
	 * Top1与店员反馈一致的次数
	 */
	@ApiField("top_1_corr_session_cnt")
	private Long top1CorrSessionCnt;

	/**
	 * 称重商品识别次数
	 */
	@ApiField("weigh_session_cnt")
	private Long weighSessionCnt;

	public String getCorrRate() {
		return this.corrRate;
	}
	public void setCorrRate(String corrRate) {
		this.corrRate = corrRate;
	}

	public Long getCorrSessionCnt() {
		return this.corrSessionCnt;
	}
	public void setCorrSessionCnt(Long corrSessionCnt) {
		this.corrSessionCnt = corrSessionCnt;
	}

	public Long getDeviceCnt() {
		return this.deviceCnt;
	}
	public void setDeviceCnt(Long deviceCnt) {
		this.deviceCnt = deviceCnt;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDim() {
		return this.dim;
	}
	public void setDim(String dim) {
		this.dim = dim;
	}

	public String getDt() {
		return this.dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}

	public String getIsvName() {
		return this.isvName;
	}
	public void setIsvName(String isvName) {
		this.isvName = isvName;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public Long getMerchantCnt() {
		return this.merchantCnt;
	}
	public void setMerchantCnt(Long merchantCnt) {
		this.merchantCnt = merchantCnt;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public Long getOnly1CorrSessionCnt() {
		return this.only1CorrSessionCnt;
	}
	public void setOnly1CorrSessionCnt(Long only1CorrSessionCnt) {
		this.only1CorrSessionCnt = only1CorrSessionCnt;
	}

	public Long getOnly1SessionCnt() {
		return this.only1SessionCnt;
	}
	public void setOnly1SessionCnt(Long only1SessionCnt) {
		this.only1SessionCnt = only1SessionCnt;
	}

	public String getSelectRate() {
		return this.selectRate;
	}
	public void setSelectRate(String selectRate) {
		this.selectRate = selectRate;
	}

	public Long getSelectaiSessionCnt() {
		return this.selectaiSessionCnt;
	}
	public void setSelectaiSessionCnt(Long selectaiSessionCnt) {
		this.selectaiSessionCnt = selectaiSessionCnt;
	}

	public Long getSessionCnt() {
		return this.sessionCnt;
	}
	public void setSessionCnt(Long sessionCnt) {
		this.sessionCnt = sessionCnt;
	}

	public Long getStoreCnt() {
		return this.storeCnt;
	}
	public void setStoreCnt(Long storeCnt) {
		this.storeCnt = storeCnt;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return this.storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getTimePeriod() {
		return this.timePeriod;
	}
	public void setTimePeriod(String timePeriod) {
		this.timePeriod = timePeriod;
	}

	public String getTop1CorrRate() {
		return this.top1CorrRate;
	}
	public void setTop1CorrRate(String top1CorrRate) {
		this.top1CorrRate = top1CorrRate;
	}

	public Long getTop1CorrSessionCnt() {
		return this.top1CorrSessionCnt;
	}
	public void setTop1CorrSessionCnt(Long top1CorrSessionCnt) {
		this.top1CorrSessionCnt = top1CorrSessionCnt;
	}

	public Long getWeighSessionCnt() {
		return this.weighSessionCnt;
	}
	public void setWeighSessionCnt(Long weighSessionCnt) {
		this.weighSessionCnt = weighSessionCnt;
	}

}
