package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CardLevelConfigDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.card.level.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-13 14:11:54
 */
public class AlipayUserCardLevelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5221483519465328357L;

	/** 
	 * card_level_configs：卡等级配置
	 */
	@ApiListField("card_level_configs")
	@ApiField("card_level_config_d_t_o")
	private List<CardLevelConfigDTO> cardLevelConfigs;

	public void setCardLevelConfigs(List<CardLevelConfigDTO> cardLevelConfigs) {
		this.cardLevelConfigs = cardLevelConfigs;
	}
	public List<CardLevelConfigDTO> getCardLevelConfigs( ) {
		return this.cardLevelConfigs;
	}

}
