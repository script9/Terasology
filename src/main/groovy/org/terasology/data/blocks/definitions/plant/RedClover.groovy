/*
 * Copyright 2012 Benjamin Glatzel <benjamin.glatzel@me.com>
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
package org.terasology.data.blocks.definitions.plant

import org.terasology.model.blocks.Block.BLOCK_FORM
import org.terasology.model.blocks.Block.COLOR_SOURCE

/**
 * Maybe you can find a four leaf clover among these?
 * @author (art) eleazzaar
 */
block {
    version = 1
    shape = "Billboard"
    blockform = BLOCK_FORM.BILLBOARD
    colorsource = COLOR_SOURCE.FOLIAGE_LUT

    transparent = true
    translucent = true
    penetrable = true
    waving = true

    hardness = 1
}