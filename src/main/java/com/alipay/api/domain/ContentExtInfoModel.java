package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 行业场景运营内扩展信息模型
 *
 * @author auto create
 * @since 1.0, 2019-01-29 16:43:52
 */
public class ContentExtInfoModel extends AlipayObject {

	private static final long serialVersionUID = 8364699719843972143L;

	/**
	 * 奖品信息
	 */
	@ApiListField("prize_info_list")
	@ApiField("content_prize_info_model")
	private List<ContentPrizeInfoModel> prizeInfoList;

	public List<ContentPrizeInfoModel> getPrizeInfoList() {
		return this.prizeInfoList;
	}
	public void setPrizeInfoList(List<ContentPrizeInfoModel> prizeInfoList) {
		this.prizeInfoList = prizeInfoList;
	}

}
