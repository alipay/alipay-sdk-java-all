package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 淘客任务明星用户集合
 *
 * @author auto create
 * @since 1.0, 2023-12-12 16:12:07
 */
public class StarUidAmountRatioDTO extends AlipayObject {

	private static final long serialVersionUID = 5678893761469235638L;

	/**
	 * 分佣比率，格式:xx%
	 */
	@ApiField("ratio")
	private String ratio;

	/**
	 * 淘客用户id集合
	 */
	@ApiListField("uid_list")
	@ApiField("string")
	private List<String> uidList;

	/**
	 * 淘客用户openId集合
	 */
	@ApiListField("user_open_id_list")
	@ApiField("string")
	private List<String> userOpenIdList;

	public String getRatio() {
		return this.ratio;
	}
	public void setRatio(String ratio) {
		this.ratio = ratio;
	}

	public List<String> getUidList() {
		return this.uidList;
	}
	public void setUidList(List<String> uidList) {
		this.uidList = uidList;
	}

	public List<String> getUserOpenIdList() {
		return this.userOpenIdList;
	}
	public void setUserOpenIdList(List<String> userOpenIdList) {
		this.userOpenIdList = userOpenIdList;
	}

}
