package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑零售商户信息查询
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:17:29
 */
public class KoubeiRetailWmsPartnerQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1441471721248476639L;

	/**
	 * 操作上下文
	 */
	@ApiField("operate_context")
	private OperateContext operateContext;

	/**
	 * 商户ID，限制批量查询100个ID
	 */
	@ApiListField("partner_ids")
	@ApiField("string")
	private List<String> partnerIds;

	public OperateContext getOperateContext() {
		return this.operateContext;
	}
	public void setOperateContext(OperateContext operateContext) {
		this.operateContext = operateContext;
	}

	public List<String> getPartnerIds() {
		return this.partnerIds;
	}
	public void setPartnerIds(List<String> partnerIds) {
		this.partnerIds = partnerIds;
	}

}
