package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.WorldOfflineDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.world.carddata.apply response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-20 12:07:21
 */
public class AlipayCommerceTransportWorldCarddataApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8258348621226638784L;

	/** 
	 * 卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/** 
	 * 生码时间戳
	 */
	@ApiField("card_timestamp")
	private String cardTimestamp;

	/** 
	 * 虚拟卡卡类型
	 */
	@ApiField("card_type")
	private String cardType;

	/** 
	 * 是否首次使用
	 */
	@ApiField("first_use_time")
	private Boolean firstUseTime;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

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

	public void setCardTimestamp(String cardTimestamp) {
		this.cardTimestamp = cardTimestamp;
	}
	public String getCardTimestamp( ) {
		return this.cardTimestamp;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardType( ) {
		return this.cardType;
	}

	public void setFirstUseTime(Boolean firstUseTime) {
		this.firstUseTime = firstUseTime;
	}
	public Boolean getFirstUseTime( ) {
		return this.firstUseTime;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setWorldOfflineDataInfo(WorldOfflineDataInfo worldOfflineDataInfo) {
		this.worldOfflineDataInfo = worldOfflineDataInfo;
	}
	public WorldOfflineDataInfo getWorldOfflineDataInfo( ) {
		return this.worldOfflineDataInfo;
	}

}
