package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 描述结算信息，json格式。
 *
 * @author auto create
 * @since 1.0, 2019-04-02 16:24:40
 */
public class SettleInfo extends AlipayObject {

	private static final long serialVersionUID = 2359836295595139941L;

	/**
	 * 结算详细信息，json数组，目前只支持一条。
	 */
	@ApiListField("settle_detail_infos")
	@ApiField("settle_detail_info")
	private List<SettleDetailInfo> settleDetailInfos;

	public List<SettleDetailInfo> getSettleDetailInfos() {
		return this.settleDetailInfos;
	}
	public void setSettleDetailInfos(List<SettleDetailInfo> settleDetailInfos) {
		this.settleDetailInfos = settleDetailInfos;
	}

}
