package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.WorldBaseRPCResponseInfo;
import com.alipay.api.domain.WorldOfflineDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.world.carddata.apply response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-13 10:41:49
 */
public class AlipayCommerceTransportWorldCarddataApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3865513921243687818L;

	/** 
	 * 卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/** 
	 * 生码时间戳
	 */
	@ApiField("card_timestamp")
	private Long cardTimestamp;

	/** 
	 * 虚拟卡卡类型
	 */
	@ApiField("card_type")
	private String cardType;

	/** 
	 * 请求失败时的错误信息
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 是否首次使用
	 */
	@ApiField("first_use_time")
	private Boolean firstUseTime;

	/** 
	 * 请求失败时返回的子错误码信息
	 */
	@ApiField("sub_error_code")
	private String subErrorCode;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 基础响应信息
	 */
	@ApiField("world_base_rpc_response_info")
	private WorldBaseRPCResponseInfo worldBaseRpcResponseInfo;

	/** 
	 * 密钥数据
	 */
	@ApiField("world_offline_data_info")
	private WorldOfflineDataInfo worldOfflineDataInfo;

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardNo( ) {
		return this.cardNo;
	}

	public void setCardTimestamp(Long cardTimestamp) {
		this.cardTimestamp = cardTimestamp;
	}
	public Long getCardTimestamp( ) {
		return this.cardTimestamp;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardType( ) {
		return this.cardType;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage( ) {
		return this.errorMessage;
	}

	public void setFirstUseTime(Boolean firstUseTime) {
		this.firstUseTime = firstUseTime;
	}
	public Boolean getFirstUseTime( ) {
		return this.firstUseTime;
	}

	public void setSubErrorCode(String subErrorCode) {
		this.subErrorCode = subErrorCode;
	}
	public String getSubErrorCode( ) {
		return this.subErrorCode;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setWorldBaseRpcResponseInfo(WorldBaseRPCResponseInfo worldBaseRpcResponseInfo) {
		this.worldBaseRpcResponseInfo = worldBaseRpcResponseInfo;
	}
	public WorldBaseRPCResponseInfo getWorldBaseRpcResponseInfo( ) {
		return this.worldBaseRpcResponseInfo;
	}

	public void setWorldOfflineDataInfo(WorldOfflineDataInfo worldOfflineDataInfo) {
		this.worldOfflineDataInfo = worldOfflineDataInfo;
	}
	public WorldOfflineDataInfo getWorldOfflineDataInfo( ) {
		return this.worldOfflineDataInfo;
	}

}
