package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询健康数据接口
 *
 * @author auto create
 * @since 1.0, 2026-08-13 16:33:24
 */
public class AlipayCommerceMedicalMemberHealthdataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1259751948147493313L;

	/**
	 * {"fieldDesc":"HEALTH_CARD(\"C\", \"默认toC渠道卡\", \"健康卡\"),\n    OPPO(\"OPPO\", \"OPPO渠道卡\", \"OPPO\"),\n    AQ(\"AQ\", \"AQ渠道卡\", \"阿福\"),\n    XIAOMI(\"XIAOMI\", \"小米渠道卡\", \"小米\"),\n    ANT(\"ANT\", \"员福渠道卡\", \"员福\"),\n    MEISHI(\"MEI_SHI\",\"美世渠道卡\", \"美世\"),\n    HONOR(\"HONOR\", \"荣耀渠道卡\", \"荣耀\"),\n    ANT_COMMERCIAL(\"ANT_COMMERCIAL\", \"员福商业化渠道卡\", \"员福商业化渠道\"),","fieldName":"channel","fieldZhName":"会员渠道"}
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 要获取的数据
	 */
	@ApiField("source_type")
	private String sourceType;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSourceType() {
		return this.sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

}
