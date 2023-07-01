package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * patch类型接口测试
 *
 * @author auto create
 * @since 1.0, 2023-06-30 17:22:41
 */
public class AlipayOpenOperationOpenbizmockPatchQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5198814924923217639L;

	/**
	 * test
	 */
	@ApiField("b_query")
	private String bQuery;

	/**
	 * test
	 */
	@ApiField("c_body")
	private String cBody;

	/**
	 * tst
	 */
	@ApiField("complex_a")
	private TestDemo complexA;

	/**
	 * 1
	 */
	@ApiField("complex_b")
	private TestDemo complexB;

	/**
	 * 1
	 */
	@ApiField("id_type_modify_open_id")
	private String idTypeModifyOpenId;

	/**
	 * id_type
	 */
	@ApiField("id_typea")
	private String idTypea;

	/**
	 * 元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 1
	 */
	@ApiField("uida")
	private String uida;

	public String getbQuery() {
		return this.bQuery;
	}
	public void setbQuery(String bQuery) {
		this.bQuery = bQuery;
	}

	public String getcBody() {
		return this.cBody;
	}
	public void setcBody(String cBody) {
		this.cBody = cBody;
	}

	public TestDemo getComplexA() {
		return this.complexA;
	}
	public void setComplexA(TestDemo complexA) {
		this.complexA = complexA;
	}

	public TestDemo getComplexB() {
		return this.complexB;
	}
	public void setComplexB(TestDemo complexB) {
		this.complexB = complexB;
	}

	public String getIdTypeModifyOpenId() {
		return this.idTypeModifyOpenId;
	}
	public void setIdTypeModifyOpenId(String idTypeModifyOpenId) {
		this.idTypeModifyOpenId = idTypeModifyOpenId;
	}

	public String getIdTypea() {
		return this.idTypea;
	}
	public void setIdTypea(String idTypea) {
		this.idTypea = idTypea;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getUida() {
		return this.uida;
	}
	public void setUida(String uida) {
		this.uida = uida;
	}

}
