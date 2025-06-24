package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 全局分段限额
 *
 * @author auto create
 * @since 1.0, 2024-03-11 15:17:01
 */
public class QuotaGradientRuleApiConfig extends AlipayObject {

	private static final long serialVersionUID = 4664717633497927335L;

	/**
	 * 芝麻分350-399限额，单位元，如果想给不同芝麻分的用户不同的免押金额，比如设置650分用户可免押金5000元，则押金大于5000的商品，650分的用户不支持信用免押，需支付押金。
	 */
	@ApiField("score_400")
	private Long score400;

	/**
	 * 芝麻分400-449限额，单位元，如果想给不同芝麻分的用户不同的免押金额，比如设置650分用户可免押金5000元，则押金大于5000的商品，650分的用户不支持信用免押，需支付押金。
	 */
	@ApiField("score_450")
	private Long score450;

	/**
	 * 芝麻分450-499限额，单位元，如果想给不同芝麻分的用户不同的免押金额，比如设置650分用户可免押金5000元，则押金大于5000的商品，650分的用户不支持信用免押，需支付押金。
	 */
	@ApiField("score_500")
	private Long score500;

	/**
	 * 芝麻分500-549限额，单位元，如果想给不同芝麻分的用户不同的免押金额，比如设置650分用户可免押金5000元，则押金大于5000的商品，650分的用户不支持信用免押，需支付押金。
	 */
	@ApiField("score_550")
	private Long score550;

	/**
	 * 芝麻分550-599限额，单位元，如果想给不同芝麻分的用户不同的免押金额，比如设置650分用户可免押金5000元，则押金大于5000的商品，650分的用户不支持信用免押，需支付押金。
	 */
	@ApiField("score_600")
	private Long score600;

	/**
	 * 芝麻分600-649限额，单位元，如果想给不同芝麻分的用户不同的免押金额，比如设置650分用户可免押金5000元，则押金大于5000的商品，650分的用户不支持信用免押，需支付押金。
	 */
	@ApiField("score_650")
	private Long score650;

	/**
	 * 芝麻分650-699限额，单位元，如果想给不同芝麻分的用户不同的免押金额，比如设置650分用户可免押金5000元，则押金大于5000的商品，650分的用户不支持信用免押，需支付押金。
	 */
	@ApiField("score_700")
	private Long score700;

	/**
	 * 芝麻分700-749限额，单位元，如果想给不同芝麻分的用户不同的免押金额，比如设置650分用户可免押金5000元，则押金大于5000的商品，650分的用户不支持信用免押，需支付押金。
	 */
	@ApiField("score_750")
	private Long score750;

	/**
	 * 芝麻分750-799限额，单位元，如果想给不同芝麻分的用户不同的免押金额，比如设置650分用户可免押金5000元，则押金大于5000的商品，650分的用户不支持信用免押，需支付押金。
	 */
	@ApiField("score_800")
	private Long score800;

	/**
	 * 芝麻分800-849限额，单位元，如果想给不同芝麻分的用户不同的免押金额，比如设置650分用户可免押金5000元，则押金大于5000的商品，650分的用户不支持信用免押，需支付押金。
	 */
	@ApiField("score_850")
	private Long score850;

	/**
	 * 芝麻分850-899限额，单位元，如果想给不同芝麻分的用户不同的免押金额，比如设置650分用户可免押金5000元，则押金大于5000的商品，650分的用户不支持信用免押，需支付押金。
	 */
	@ApiField("score_900")
	private Long score900;

	/**
	 * 芝麻分900-950限额，单位元，如果想给不同芝麻分的用户不同的免押金额，比如设置650分用户可免押金5000元，则押金大于5000的商品，650分的用户不支持信用免押，需支付押金。
	 */
	@ApiField("score_950")
	private Long score950;

	public Long getScore400() {
		return this.score400;
	}
	public void setScore400(Long score400) {
		this.score400 = score400;
	}

	public Long getScore450() {
		return this.score450;
	}
	public void setScore450(Long score450) {
		this.score450 = score450;
	}

	public Long getScore500() {
		return this.score500;
	}
	public void setScore500(Long score500) {
		this.score500 = score500;
	}

	public Long getScore550() {
		return this.score550;
	}
	public void setScore550(Long score550) {
		this.score550 = score550;
	}

	public Long getScore600() {
		return this.score600;
	}
	public void setScore600(Long score600) {
		this.score600 = score600;
	}

	public Long getScore650() {
		return this.score650;
	}
	public void setScore650(Long score650) {
		this.score650 = score650;
	}

	public Long getScore700() {
		return this.score700;
	}
	public void setScore700(Long score700) {
		this.score700 = score700;
	}

	public Long getScore750() {
		return this.score750;
	}
	public void setScore750(Long score750) {
		this.score750 = score750;
	}

	public Long getScore800() {
		return this.score800;
	}
	public void setScore800(Long score800) {
		this.score800 = score800;
	}

	public Long getScore850() {
		return this.score850;
	}
	public void setScore850(Long score850) {
		this.score850 = score850;
	}

	public Long getScore900() {
		return this.score900;
	}
	public void setScore900(Long score900) {
		this.score900 = score900;
	}

	public Long getScore950() {
		return this.score950;
	}
	public void setScore950(Long score950) {
		this.score950 = score950;
	}

}
