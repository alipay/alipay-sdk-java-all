package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RainyComplexTypesTheFourteen;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.treeapifourteen.rainystest.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-29 15:42:34
 */
public class AlipayDataDataserviceTreeapifourteenRainystestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8276217232743864459L;

	/** 
	 * test case for pre
	 */
	@ApiField("demo_case")
	private String demoCase;

	/** 
	 * 完全copy引用复杂类型
	 */
	@ApiField("res_copy_weak_ref")
	private RainyComplexTypesTheFourteen resCopyWeakRef;

	/** 
	 * 字段copy引用模型
	 */
	@ApiField("res_field_weak_ref")
	private RainyComplexTypesTheFourteen resFieldWeakRef;

	/** 
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public void setDemoCase(String demoCase) {
		this.demoCase = demoCase;
	}
	public String getDemoCase( ) {
		return this.demoCase;
	}

	public void setResCopyWeakRef(RainyComplexTypesTheFourteen resCopyWeakRef) {
		this.resCopyWeakRef = resCopyWeakRef;
	}
	public RainyComplexTypesTheFourteen getResCopyWeakRef( ) {
		return this.resCopyWeakRef;
	}

	public void setResFieldWeakRef(RainyComplexTypesTheFourteen resFieldWeakRef) {
		this.resFieldWeakRef = resFieldWeakRef;
	}
	public RainyComplexTypesTheFourteen getResFieldWeakRef( ) {
		return this.resFieldWeakRef;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
