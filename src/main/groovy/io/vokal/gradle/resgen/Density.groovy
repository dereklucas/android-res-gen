/*
 * Copyright 2016 Vokal
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.vokal.gradle.resgen

/**
 * Represents the different densities we can scale assets for.
 * Scale is used for PDFRenderer where "where 1 = 72 DPI"
 */
enum Density {

    LDPI(0.75f, 1.666f),
    MDPI(1, 2.222f),
    HDPI(1.5f, 3.333f),
    XHDPI(2, 4.444f),
    XXHDPI(3, 6.666f),
    XXXHDPI(4, 8.888f);

    float multiplier;
    float scale;

    Density(float multiplier, float scale) {
        this.multiplier = multiplier
        this.scale = scale
    }

    float getMultiplier() {
        return multiplier
    }

    float getScale() {
        return scale
    }
}
