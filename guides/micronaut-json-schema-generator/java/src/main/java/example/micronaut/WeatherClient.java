/*
 * Copyright 2017-2024 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package example.micronaut;

import com.example.openweather.OpenweatherCurrentWeatherDataApi;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.client.annotation.Client;

@Client(id = "openweather") // <1>
public interface WeatherClient {
    @Get("/data/2.5/weather?lat={lat}&lon={lon}&appid=${openweather.apikey}") // <2>
    OpenweatherCurrentWeatherDataApi current(@PathVariable String lat,  // <3>
                                             @PathVariable String lon); // <3>
}
