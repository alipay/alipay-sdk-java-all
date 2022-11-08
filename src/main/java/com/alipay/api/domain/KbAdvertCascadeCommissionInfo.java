package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 二级分佣信息
 *
 * @author auto create
 * @since 1.0, 2017-03-01 15:42:20
 */
public class KbAdvertCascadeCommissionInfo extends AlipayObject {

	private static final long serialVersionUID = 1685451291929638691L;

	/**
	 * 二级分佣条款信息
	 */
	@ApiListField("commission_clause_infos")
	@ApiField("kb_advert_commission_clause")
	private List<KbAdvertCommissionClause> commissionClauseInfos;

	/**
	 * 二级分佣任务认领人类型
PROMOTER：其他推广者
KOUBEI_PLATFORM：口碑平台
	 */
	@ApiField("commission_user_type")
	private String commissionUserType;

	public List<KbAdvertCommissionClause> getCommissionClauseInfos() {
		return this.commissionClauseInfos;
	}
	public void setCommissionClauseInfos(List<KbAdvertCommissionClause> commissionClauseInfos) {
		this.commissionClauseInfos = commissionClauseInfos;
	}

	public String getCommissionUserType() {
		return this.commissionUserType;
	}
	public void setCommissionUserType(String commissionUserType) {
		this.commissionUserType = commissionUserType;
	}

}
