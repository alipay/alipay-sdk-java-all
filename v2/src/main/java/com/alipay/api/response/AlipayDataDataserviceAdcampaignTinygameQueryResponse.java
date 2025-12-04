package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TinyGameRes;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.adcampaign.tinygame.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-14 17:37:32
 */
public class AlipayDataDataserviceAdcampaignTinygameQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1377162145517599349L;

	/** 
	 * 小游戏列表信息，返回商家下面可投的所有小游戏appId。若无小游戏，返回空列表
	 */
	@ApiListField("tiny_game_list")
	@ApiField("tiny_game_res")
	private List<TinyGameRes> tinyGameList;

	public void setTinyGameList(List<TinyGameRes> tinyGameList) {
		this.tinyGameList = tinyGameList;
	}
	public List<TinyGameRes> getTinyGameList( ) {
		return this.tinyGameList;
	}

}
