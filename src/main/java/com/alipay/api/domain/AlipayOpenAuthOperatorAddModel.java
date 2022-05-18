package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 添加蚂蚁操作员
 *
 * @author auto create
 * @since 1.0, 2022-05-12 17:07:29
 */
public class AlipayOpenAuthOperatorAddModel extends AlipayObject {

	private static final long serialVersionUID = 5374734554656775361L;

	/**
	 * 添加蚂蚁操作员参数
	 */
	@ApiField("operator_add_vo")
	private OperatorAddVO operatorAddVo;

	public OperatorAddVO getOperatorAddVo() {
		return this.operatorAddVo;
	}
	public void setOperatorAddVo(OperatorAddVO operatorAddVo) {
		this.operatorAddVo = operatorAddVo;
	}

}
