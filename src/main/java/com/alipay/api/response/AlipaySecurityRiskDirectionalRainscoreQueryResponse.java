package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InfoCode;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.directional.rainscore.query response.
 * 
 * @author auto create
 * @since 1.0, 2018-06-08 14:07:55
 */
public class AlipaySecurityRiskDirectionalRainscoreQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7332569183648427684L;

	/** 
	 * 风险解释，即本次风险评分中TOP 3风险因子的代码、名称、解释、风险倍数（JSON格式）。详情请参考<a href="https://doc.open.alipay.com/doc2/detail.htm?treeId=214&articleId=104588&docType=1">风险解释</a>
	 */
	@ApiListField("infocode")
	@ApiField("info_code")
	private List<InfoCode> infocode;

	/** 
	 * 风险评分，范围为[0,100]，评分越高风险越大；查询不到，返回默认值为-1
	 */
	@ApiField("score")
	private String score;

	/** 
	 * 调用订单号
	 */
	@ApiField("unique_id")
	private String uniqueId;

	public void setInfocode(List<InfoCode> infocode) {
		this.infocode = infocode;
	}
	public List<InfoCode> getInfocode( ) {
		return this.infocode;
	}

	public void setScore(String score) {
		this.score = score;
	}
	public String getScore( ) {
		return this.score;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getUniqueId( ) {
		return this.uniqueId;
	}

}
