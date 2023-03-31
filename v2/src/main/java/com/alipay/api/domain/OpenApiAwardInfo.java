package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 奖项信息
 *
 * @author auto create
 * @since 1.0, 2023-03-02 11:13:40
 */
public class OpenApiAwardInfo extends AlipayObject {

	private static final long serialVersionUID = 3139632974451717531L;

	/**
	 * 奖品当前数额
	 */
	@ApiField("current_award")
	private String currentAward;

	/**
	 * 奖项详情
	 */
	@ApiListField("detail_list")
	@ApiField("string")
	private List<String> detailList;

	/**
	 * 奖品总计数额
	 */
	@ApiField("total_award")
	private String totalAward;

	public String getCurrentAward() {
		return this.currentAward;
	}
	public void setCurrentAward(String currentAward) {
		this.currentAward = currentAward;
	}

	public List<String> getDetailList() {
		return this.detailList;
	}
	public void setDetailList(List<String> detailList) {
		this.detailList = detailList;
	}

	public String getTotalAward() {
		return this.totalAward;
	}
	public void setTotalAward(String totalAward) {
		this.totalAward = totalAward;
	}

}
