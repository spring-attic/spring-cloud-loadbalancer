/*
 * Copyright 2013-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.loadbalancer.core;

import org.springframework.cloud.client.ServiceInstance;
import reactor.core.publisher.Mono;

/**
 * @author Spencer Gibb
 */
class DefaultReactiveResponse implements ReactiveLoadBalancer.Response<ServiceInstance> {

	private final ServiceInstance serviceInstance;

	public DefaultReactiveResponse(ServiceInstance serviceInstance) {
		this.serviceInstance = serviceInstance;
	}

	@Override
	public Mono<ServiceInstance> getServer() {
		return Mono.just(this.serviceInstance);
	}

	@Override
	public Mono<Void> onComplete(OnComplete onComplete) {
		return Mono.empty(); //TODO: implement
	}
}
