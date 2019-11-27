package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 测试零六零一
 *
 * @author auto create
 * @since 1.0, 2017-08-29 19:44:54
 */
public class AlipayOpenAppLingliulingyiLingliulingyiQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8653843721595284636L;

	/**
	 * 示例
	 */
	@ApiListField("id_user")
	@ApiField("string")
	private List<String> idUser;

	public List<String> getIdUser() {
		return this.idUser;
	}
	public void setIdUser(List<String> idUser) {
		this.idUser = idUser;
	}

}
