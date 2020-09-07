/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.mybatis.samples.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.mybatis.domain.Audit;

/**
 * Goods, for test case use.
 *
 * @author JARVIS SONG
 * @since 2.0.0
 */
@Entity
@Table(name = "t_goods")
@Data
@NoArgsConstructor
public class Goods extends Audit<Long, Long> {

	private String name;

	private Integer inventory;

	private String brand;

	@ManyToOne
	@JoinColumn(name = "category_id", referencedColumnName = "id")
	private Category category;

	@ManyToOne
	@JoinColumn(name = "shop_id", referencedColumnName = "id")
	private Shop shop;

	public Goods(String name) {
		this.name = name;
	}

}
